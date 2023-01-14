**Java + Spring을 이용한 간단한 ToDo 리스트 프로젝트**

# 기능 명세

- ToDo 리스트 목록에 아이템 추가 기능
- ToDo 리스트 목록 중 특정 아이템 조회 기능
- ToDo 리스트 목록 전체 목록 조회 기능
- ToDo 리스트 목록 중 특정 아이템 수정 기능
- ToDo 리스트 목록 중 특정 아이템 삭제 기능
- ToDo 리스트 목록 전체 목록 삭제 기능

# API 스펙

## 리스트 아이템 추가

ToDo 리스트에 아이템을 추가하는 기능입니다.

- method: `POST`
- endpoint: `/`
- request

```json
{
  "title": "Spring 공부하기"
}
```

- response

```json
{
  "id": 5,
  "title": "Spring 공부하기",
  "order": 0,
  "completed": false,
  "url": "http://localhost:8080/5"
}
```

## 전체 리스트 조회

전체 ToDo 리스트의 아이템을 조회하는 기능입니다.

- method: `GET`
- endpoint: `/`
- request: -
- response:

```json
[
  {
	  "id": 1,
  	"title": "Java 공부하기",
	  "order": 0,
	  "completed": false,
	  "url": "http://localhost:8080/1"
  },
  {
	  "id": 2,
  	"title": "Python 공부하기",
	  "order": 0,
	  "completed": false,
	  "url": "http://localhost:8080/2"
  },
  ...
  
]
```

## 리스트 특정 아이템 조회

ToDo 리스트에 있는 특정 아이템을 조회하는 기능입니다.

- method: `GET`
- endpoint: `/{:id}`
- request:

- response:

```json
{
  "id": 5,
  "title": "Spring 공부하기",
  "order": 0,
  "completed": false,
  "url": "http://localhost:8080/5"
}
```

## 리스트 특정 아이템 수정

ToDo 리스트에 있는 특정 아이템을 수정하는 기능입니다.

- method: `PATCH`
- endpoint: `/{:id}`
- request:

```json
{
  "title": "JavaScript 공부하기"
}
```

- response:

```json
{
  "id": 1,
  "title": "JavaScript 공부하기",
  "order": 0,
  "completed": false,
  "url": "http://localhost:8080/1"
}
```

## 전체 리스트 삭제

ToDo 리스트에 있는 모든 아이템을 삭제하는 기능입니다.

- method: `DELETE`
- endpoint: `/`
- request:
- response: 200(성공)

## 리스트 특정 아이템 삭제

ToDo 리스트에 있는 특정 아이템을 삭제하는 기능입니다.

- method: `DELETE`
- endpoint: `/{:id}`

- request:
- response: 200(성공)