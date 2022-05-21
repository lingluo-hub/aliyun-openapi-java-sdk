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

package com.aliyuncs.multimediaai.model.v20190810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.multimediaai.transform.v20190810.RegisterFaceImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RegisterFaceImageResponse extends AcsResponse {

	private String requestId;

	private List<FaceImage> faceImages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FaceImage> getFaceImages() {
		return this.faceImages;
	}

	public void setFaceImages(List<FaceImage> faceImages) {
		this.faceImages = faceImages;
	}

	public static class FaceImage {

		private Long faceImageId;

		public Long getFaceImageId() {
			return this.faceImageId;
		}

		public void setFaceImageId(Long faceImageId) {
			this.faceImageId = faceImageId;
		}
	}

	@Override
	public RegisterFaceImageResponse getInstance(UnmarshallerContext context) {
		return	RegisterFaceImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
