// 10. 객체 (Object)

// 강아지 이름 : 뚜비 / 나이 3살
let dog = {
	name: "뚜비",
	age: 3,
}

let name = "ox	";
let age = 4;

let person = {
	name,age,
	gender:"Male",
}

console.log('birth' in person);

for (let key in person) {
	console.log(person[key]);
}