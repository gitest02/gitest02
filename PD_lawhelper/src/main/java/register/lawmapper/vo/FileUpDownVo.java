package register.lawmapper.vo;

import java.util.List;

public class FileUpDownVo {
	private List<String> fileName;//파일이름
	private List<String> fileSize;//파일크기
	private String filePath;//서버파일경로
	private String imgName;//이미지이름
	private String imgSize;//이미지크기
	private String imgPath;//이미지경로 
	
	public List<String> getFileSize() {
		return fileSize;
	}
	public void setFileSize(List<String> fileSize) {
		this.fileSize = fileSize;
	}

	public List<String> getFileName() {
		return fileName;
	}
	public void setFileName(List<String> fileName) {
		this.fileName = fileName;
	}
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public String getImgSize() {
		return imgSize;
	}
	public void setImgSize(String imgSize) {
		this.imgSize = imgSize;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

}
