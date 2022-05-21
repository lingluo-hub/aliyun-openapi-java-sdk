/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetUserUploadFileJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserUploadFileJobResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private UploadFileJobDetail uploadFileJobDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public UploadFileJobDetail getUploadFileJobDetail() {
		return this.uploadFileJobDetail;
	}

	public void setUploadFileJobDetail(UploadFileJobDetail uploadFileJobDetail) {
		this.uploadFileJobDetail = uploadFileJobDetail;
	}

	public static class UploadFileJobDetail {

		private String jobKey;

		private String fileName;

		private Long fileSize;

		private String fileSource;

		private String uploadType;

		private String uploadURL;

		private Long uploadedSize;

		private String jobStatus;

		private String jobStatusDesc;

		private String attachmentKey;

		private UploadOSSParam uploadOSSParam;

		public String getJobKey() {
			return this.jobKey;
		}

		public void setJobKey(String jobKey) {
			this.jobKey = jobKey;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public Long getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Long fileSize) {
			this.fileSize = fileSize;
		}

		public String getFileSource() {
			return this.fileSource;
		}

		public void setFileSource(String fileSource) {
			this.fileSource = fileSource;
		}

		public String getUploadType() {
			return this.uploadType;
		}

		public void setUploadType(String uploadType) {
			this.uploadType = uploadType;
		}

		public String getUploadURL() {
			return this.uploadURL;
		}

		public void setUploadURL(String uploadURL) {
			this.uploadURL = uploadURL;
		}

		public Long getUploadedSize() {
			return this.uploadedSize;
		}

		public void setUploadedSize(Long uploadedSize) {
			this.uploadedSize = uploadedSize;
		}

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getJobStatusDesc() {
			return this.jobStatusDesc;
		}

		public void setJobStatusDesc(String jobStatusDesc) {
			this.jobStatusDesc = jobStatusDesc;
		}

		public String getAttachmentKey() {
			return this.attachmentKey;
		}

		public void setAttachmentKey(String attachmentKey) {
			this.attachmentKey = attachmentKey;
		}

		public UploadOSSParam getUploadOSSParam() {
			return this.uploadOSSParam;
		}

		public void setUploadOSSParam(UploadOSSParam uploadOSSParam) {
			this.uploadOSSParam = uploadOSSParam;
		}

		public static class UploadOSSParam {

			private String endpoint;

			private String bucketName;

			private String objectName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getBucketName() {
				return this.bucketName;
			}

			public void setBucketName(String bucketName) {
				this.bucketName = bucketName;
			}

			public String getObjectName() {
				return this.objectName;
			}

			public void setObjectName(String objectName) {
				this.objectName = objectName;
			}
		}
	}

	@Override
	public GetUserUploadFileJobResponse getInstance(UnmarshallerContext context) {
		return	GetUserUploadFileJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
