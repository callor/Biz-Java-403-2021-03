# git repository(저장소)업로드 하기
## 원격저장소 
* https://github.com/callor/프로젝트.git
* github.com 의 생성한 repository

## local 프로젝트
* C:/bizworks/javaworks

## local 저장소
* local 프로젝트를 local 저장소로 설정

## git-hub 저장소 생성
1. https://github.com/callor 접속
2. github 로그인 
3. New repository 생성
4. Biz_403_2021_03_Java 이름 지정하고 create...

## local 저장소 설정(생성)
* local 프로젝트 폴더를 local 저장소로 설정하기
1. c:/bizworks/javaworks 폴더에서 git bash 실행
- bash shell 화면 나타남, window의 cmd 창과 유사

2. local 저장소 선언
* git init

3. local 저장소를 github 계정과 연결
* git config --local user.name 여러분ID
* git config --local user.email 여러분email

4. local 프로젝트 압축 준비
* 압축금지 파일 설정
* touch .gitignore 로 파일 생성
* .gitignore 파일을 sublime text로 열어서 압축금지 파일 정보 등록

5. local 프로젝트를 압축하여 local 저장소에 옮길 준비를 하라
* git add .

6. local 저장소에 옮겨라 
* git commit -m "comment"

7. local 저장소에 있는 파일들을 원격저장소로 업로드 하라
* git push https://gitbub.com/callor/Biz_403_2021_Java.git master





