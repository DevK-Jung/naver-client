# naver-client

> Java 기반의 네이버 뉴스 검색 API 클라이언트 프로젝트입니다.

## 📦 프로젝트 구조

```
naver-client/
├── http-client/       # HTTP 요청 및 응답 처리 모듈
├── naver-news/        # 네이버 뉴스 API 연동 모듈
├── gradle/            # Gradle 래퍼 설정
├── build.gradle       # 빌드 설정 파일
├── settings.gradle    # 프로젝트 설정 파일
└── ...
```

## 🚀 주요 기능

- 네이버 뉴스 검색 API를 통한 뉴스 데이터 수집
- HTTP 클라이언트를 이용한 RESTful API 호출
- Gradle 기반 멀티모듈 프로젝트 구성

## 🛠️ 사용 방법

### 1. 프로젝트 클론

```bash
git clone https://github.com/DevK-Jung/naver-client.git
cd naver-client
```

### 2. Gradle 빌드

```bash
./gradlew build
```

### 3. 실행 방법

`naver-news` 모듈의 메인 클래스를 실행하여 네이버 뉴스 데이터를 수집할 수 있습니다.

## 🔧 환경 설정

네이버 API를 사용하기 위해서는 [네이버 개발자 센터](https://developers.naver.com/main/)에서 애플리케이션을 등록하고, 클라이언트 ID와 시크릿을 발급받아야 합니다.

이후, 해당 정보를 프로젝트 내 설정 파일에 추가해야 합니다.

예시:

```properties
naver.client.id=YOUR_CLIENT_ID
naver.client.secret=YOUR_CLIENT_SECRET
```
