function bmiCheck(){
	let nameInput = document.bmiform.name;
	let heightInput = document.bmiform.height;
	let weightInput = document.bmiform.weight;
	let photoInput = document.bmiform.picture;
	
	if(!nameInput.value) {
		alert("�̸��� �ۼ��ϼ���");
		nameInput.focus();
		return false;
	}
	
	if(!heightInput.value) {
		alert("Ű�� �ۼ��ϼ���");
		nameInput.focus();
		return false;
	}
	
	 if (isNaN(heightInput.value)) {
			alert('���ڸ� ������!');
			footInput.value="";
			footInput.focus();
			return false;
		}
	
	
	if(!weightInput.value) {
		alert("ü���� �ۼ��ϼ���");
		nameInput.focus();
		return false;
	}
	
	if (isNaN(weightInput.value)) {
			alert('���ڸ� ������!');
			footInput.value="";
			footInput.focus();
			return false;
		}
	
	if(!photoInput.value) {
		alert('�����Է��ϼ���');
		photoInput.focus();
		return false;
	}
	
	
	
	return true;
	
	
	
}

