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

package com.aliyuncs.cloudphone.model.v20201230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphone.transform.v20201230.DeleteImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteImagesResponse extends AcsResponse {

	private String requestId;

	private List<ImageResponse> imageResponses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImageResponse> getImageResponses() {
		return this.imageResponses;
	}

	public void setImageResponses(List<ImageResponse> imageResponses) {
		this.imageResponses = imageResponses;
	}

	public static class ImageResponse {

		private String code;

		private String message;

		private String imageId;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}
	}

	@Override
	public DeleteImagesResponse getInstance(UnmarshallerContext context) {
		return	DeleteImagesResponseUnmarshaller.unmarshall(this, context);
	}
}
