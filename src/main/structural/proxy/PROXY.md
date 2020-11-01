# Proxy Pattern
===============================================
### 1. 개념

* 프록시 패턴은 프록시객체를 통해 기본 객체에 접근하는 패턴이다.

##### 1.1 장점
* 기본 객체의 리소스가 무거운 경우, 프록시 객체에서 간단한 처리를 하거나 기본 객체를 캐싱 처리함으로써 부하를 줄일 수 있다.
* 기본 객체에 대한 수정 없이, 클라이언트에서의 사용과 기본 객체 사이에 일련의 로직을 프록시 객체를 통해 넣을 수 있다.
* 프록시는 기본 객체와 요청 사이에 있기 때문에, 일종의 보안의 역할도 한다.
* 구조나 코드 구현이 간단함

##### 1.2 단점
* 프록시 객체가 중간에 껴있기 때문에, 간혹 응담이 느려질 수 있다. (캐싱이 안되어있는 추기 사용의 경우)

### 2. 구조
![예제이미지1](https://blog.kakaocdn.net/dn/YZKDU/btqDGJmYL7U/rYiDgcf7dWYQzlHHKXw3Vk/img.png)   
######이미지출처: <https://ko.wikipedia.org/wiki/프록시_패턴>

>**어댑터와 프록시 패턴의 차이**   
>두 패턴 모두 기존에 존재하는 두 클래스 중간에 하나의 클래스(어댑터 혹은 프록시)를 두는 구조다.   
>따라서 전반적인 구조는 같아 보인다. 하지만 서로 구현하는 의도가 다르다.   

>어댑터는 하나의 인터페이스로 구현하는게 목적이고,   
>프록시는 다양한 방식으로 로직 컨트롤이 목적이다.

>추가로 퍼사드 패턴 역시 비슷하지만 퍼사드는 복잡한 기능을 감추고 이를 심플한 인터페이스로 제공하는것이 목적이다.