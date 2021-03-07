## Financial Services

- "Spring Framework"를 공부하기 위해서 만든 프로젝트

### API

### Join

Request

URL

```
POST /member/join
Host: http://localhost:8080
```

Paramater

| Name       | Type   | Description   | Required |
| ---------- | ------ | ------------- | -------- |
| member_num | Long   | 고객 번호     | 0        |
| id         | String | 고객 아이디   | 0        |
| name       | String | 고객 이름     | 0        |
| phone_num  | String | 고객 전화번호 | 0        |
| password   | String | 고객 비밀번호 | 0        |

Response

Key (수정중...)

| Name | Type | Description |
| ---- | ---- | ----------- |
|      |      |             |
|      |      |             |



### Find

Request

URL

```
POST /member/find
Host: http://localhost:8080
```

Paramater

| Name | Type   | Description | Required |
| ---- | ------ | ----------- | -------- |
| id   | String | 고객 아이디 | 0        |

Response

Key

| Name       | Type   | Description   |
| ---------- | ------ | ------------- |
| member_num | Long   | 고객 번호     |
| id         | String | 고객 아이디   |
| name       | String | 고객 이름     |
| phone_num  | String | 고객 전화번호 |
| password   | String | 고객 비밀번호 |

