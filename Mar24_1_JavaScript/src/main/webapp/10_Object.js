// 10. ��ü (Object)

// ������ �̸� : �Ѻ� / ���� 3��
let dog = {
	name: "�Ѻ�",
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