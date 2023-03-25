function bmiCheck(){
	let nameInput = document.bmiform.name;
	let heightInput = document.bmiform.height;
	let weightInput = document.bmiform.weight;
	let photoInput = document.bmiform.picture;
	
	if(!nameInput.value) {
		alert("이름을 작성하세요");
		nameInput.focus();
		return false;
	}
	
	if(!heightInput.value) {
		alert("키를 작성하세요");
		nameInput.focus();
		return false;
	}
	
	 if (isNaN(heightInput.value)) {
			alert('숫자만 쓰세요!');
			footInput.value="";
			footInput.focus();
			return false;
		}
	
	
	if(!weightInput.value) {
		alert("체중을 작성하세요");
		nameInput.focus();
		return false;
	}
	
	if (isNaN(weightInput.value)) {
			alert('숫자만 쓰세요!');
			footInput.value="";
			footInput.focus();
			return false;
		}
	
	if(!photoInput.value) {
		alert('사진입력하세요');
		photoInput.focus();
		return false;
	}
	
	
	
	return true;
	
	
	
}

