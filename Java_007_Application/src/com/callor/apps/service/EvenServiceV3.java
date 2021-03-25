package com.callor.apps.service;

/*
 * 객체지향 프로그래밍
 * = java는 객체지향 프로그래밍을 가장 완벽하게
 * 		구현한 최초의 프로그래밍 언어이다
 * 
 * 1. 특징 1 : 상속, extends(확장)
 * 	이미 잘 만들어진 클래스의 소스코드를 사용하여
 * 	내 프로젝트에 적용하고자 할때, 
 * 	코드를 복사 붙이기 할수 있다
 * 
 * 	하지만 복사, 붙이기한 코드는 원래 클래스의 코드가 변경되면
 * 	다시 반영하기가 매우 어렵다.
 * 
 *  클래스를 상속하게 되면, 복사 붙이기 한것과 유사하게
 *  기능을 사용할수 있으면서
 *  원래 클래스의 코드가 확장되면, 상속받은 코드에서
 *  확장된 부분이 (자동으로) 반영되는 효과를 낼수 있다.
 *  
 *  하지만 단순히 상속받는 것 만으로 객체지향의 특징을
 *  잘 나타낸다고 할수 없다.
 *  
 *  객체지향에서 상속은 단순히 코드를 
 *  이어받아 사용하는 것 뿐만이 아니고
 *  
 *  이미 만들어진 method를 사용하면서
 *  필요에 따라 일부 method를 나만의 방식으로
 *  변경(확장)하여 작성할수 있다.
 *  
 *  V1 클래스에 a(), b(), c() method가 있다고 가정할때
 *  V1 클래스에 구현된 a(), c() method는 그대로 기능을
 *  사용하면서
 *  b() method 만 나만의 방식으로 다시 작성하여
 *  사용할 수 있다.
 *  V2 클래스를 만드는 개발자는 V1의 method를 대부분
 *  그대로 사용하면서, 일부만 변경을 하기 때문에
 *  개발을 하는데 많은 시간을 절약할 수 있다.
 *  
 *  ==> 코드의 재 사용 장점 이라고 하기도 한다.
 *  
 * 
 */

public class EvenServiceV3 extends EvenServiceV1 {
}
