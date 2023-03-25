// �߸� ������ true�� (���� �߸������� true, �������̸� false�� ����)

// <input>�� �־�����
//�ƹ��͵� �Ƚ����� true, ���� ������ false
function isEmpty(input) {
	return(!input.value);
}

// <input>�� �־��� �� 
// �ѱ� / Ư�����ڰ� �����ִٸ� true, ���ٸ� fasle
function containAnother(input) {
	let pass = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ@_.";
	
	let iv = input.value;
	for (let i =0; i < iv.length; i++) {
		if (pass.indexOf(iv[i]) == -1) { // pass �� �ִ� �����߿���
															// ���� �� ������ ������
				return true;
		}
	}
	return false;
}

// <input>, ���ڼ� �� �־��� ��, 
// �� ���ڼ����� ������ true, �� ���ڼ� �̻��̸� false
function atLeastLetter(input, len) {
	return(input.value.length < len);
}

// <input> * 2 �־��� �� 
//	������ �ٸ��� true, ������ false (PW, PWȮ��)
function notEqualPw(input1, input2) {
	return(input1.value != input2.value);
}

// <input>, ���ڿ� ��Ʈ �־��� �� 
// ������ true, ������ false (�Է��� pw�� ������ ���ڿ��� ���� ���)
function notContain(input, passSet) {
	let iv = input.value;
	for (let i = 0; i < passSet.length; i++) {
		if (iv.indexOf(passSet[i]) != -1) {
			return false;
		}
	}
	return true;
}

// <input> �־��� �� 
// ���� �ƴѰ� ������ true, ���ڸ� ������ false
function isNotNumber(input) {
	return isNaN(input.value);
}

// <input>, Ȯ���� �־��� �� 
// Ȯ���� ���� �ƴϸ� true, ������ false
function isNotType(input, type) {
	// .png, .gif, .jpg ...
	type = "." + type;
	return(input.value.indexOf(type) == -1); 
}

