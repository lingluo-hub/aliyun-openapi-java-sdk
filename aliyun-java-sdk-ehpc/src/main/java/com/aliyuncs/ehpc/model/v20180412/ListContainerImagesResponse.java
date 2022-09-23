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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListContainerImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListContainerImagesResponse extends AcsResponse {

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Integer totalCount;

	private String dBInfo;

	private List<ImagesItem> images;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getDBInfo() {
		return this.dBInfo;
	}

	public void setDBInfo(String dBInfo) {
		this.dBInfo = dBInfo;
	}

	public List<ImagesItem> getImages() {
		return this.images;
	}

	public void setImages(List<ImagesItem> images) {
		this.images = images;
	}

	public static class ImagesItem {

		private String type;

		private String status;

		private String updateDateTime;

		private String repository;

		private String tag;

		private String system;

		private String imageId;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUpdateDateTime() {
			return this.updateDateTime;
		}

		public void setUpdateDateTime(String updateDateTime) {
			this.updateDateTime = updateDateTime;
		}

		public String getRepository() {
			return this.repository;
		}

		public void setRepository(String repository) {
			this.repository = repository;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getSystem() {
			return this.system;
		}

		public void setSystem(String system) {
			this.system = system;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}
	}

	@Override
	public ListContainerImagesResponse getInstance(UnmarshallerContext context) {
		return	ListContainerImagesResponseUnmarshaller.unmarshall(this, context);
	}
}
