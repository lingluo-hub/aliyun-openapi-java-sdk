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

package com.aliyuncs.imm.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateFileMetaRequest extends RpcAcsRequest<UpdateFileMetaResponse> {
	   

	private String projectName;

	@SerializedName("file")
	private File file;

	private String datasetName;
	public UpdateFileMetaRequest() {
		super("imm", "2020-09-30", "UpdateFileMeta", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public File getFile() {
		return this.file;
	}

	public void setFile(File file) {
		this.file = file;	
		if (file != null) {
			putQueryParameter("File" , new Gson().toJson(file));
		}	
	}

	public String getDatasetName() {
		return this.datasetName;
	}

	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
		if(datasetName != null){
			putQueryParameter("DatasetName", datasetName);
		}
	}

	public static class File {

		@SerializedName("CustomLabels")
		private Map<String,String> customLabels;

		@SerializedName("Figures")
		private List<FiguresItem> figures;

		@SerializedName("OSSURI")
		private String oSSURI;

		@SerializedName("FileHash")
		private String fileHash;

		@SerializedName("URI")
		private String uRI;

		@SerializedName("CustomId")
		private String customId;

		@SerializedName("MediaType")
		private String mediaType;

		@SerializedName("ContentType")
		private String contentType;

		public Map<String,String> getCustomLabels() {
			return this.customLabels;
		}

		public void setCustomLabels(Map<String,String> customLabels) {
			this.customLabels = customLabels;
		}

		public List<FiguresItem> getFigures() {
			return this.figures;
		}

		public void setFigures(List<FiguresItem> figures) {
			this.figures = figures;
		}

		public String getOSSURI() {
			return this.oSSURI;
		}

		public void setOSSURI(String oSSURI) {
			this.oSSURI = oSSURI;
		}

		public String getFileHash() {
			return this.fileHash;
		}

		public void setFileHash(String fileHash) {
			this.fileHash = fileHash;
		}

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
		}

		public String getCustomId() {
			return this.customId;
		}

		public void setCustomId(String customId) {
			this.customId = customId;
		}

		public String getMediaType() {
			return this.mediaType;
		}

		public void setMediaType(String mediaType) {
			this.mediaType = mediaType;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public static class FiguresItem {

			@SerializedName("FigureId")
			private String figureId;

			@SerializedName("FigureClusterId")
			private String figureClusterId;

			@SerializedName("FigureType")
			private String figureType;

			public String getFigureId() {
				return this.figureId;
			}

			public void setFigureId(String figureId) {
				this.figureId = figureId;
			}

			public String getFigureClusterId() {
				return this.figureClusterId;
			}

			public void setFigureClusterId(String figureClusterId) {
				this.figureClusterId = figureClusterId;
			}

			public String getFigureType() {
				return this.figureType;
			}

			public void setFigureType(String figureType) {
				this.figureType = figureType;
			}
		}
	}

	@Override
	public Class<UpdateFileMetaResponse> getResponseClass() {
		return UpdateFileMetaResponse.class;
	}

}
