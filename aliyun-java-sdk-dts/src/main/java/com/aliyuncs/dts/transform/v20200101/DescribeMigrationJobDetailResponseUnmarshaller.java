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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobDetailResponse;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobDetailResponse.DataInitializationDetail;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobDetailResponse.DataSynchronizationDetail;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobDetailResponse.StructureInitializationDetail;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobDetailResponse.StructureInitializationDetail.StructureInitializationDetail1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrationJobDetailResponseUnmarshaller {

	public static DescribeMigrationJobDetailResponse unmarshall(DescribeMigrationJobDetailResponse describeMigrationJobDetailResponse, UnmarshallerContext _ctx) {
		
		describeMigrationJobDetailResponse.setRequestId(_ctx.stringValue("DescribeMigrationJobDetailResponse.RequestId"));
		describeMigrationJobDetailResponse.setErrCode(_ctx.stringValue("DescribeMigrationJobDetailResponse.ErrCode"));
		describeMigrationJobDetailResponse.setPageRecordCount(_ctx.integerValue("DescribeMigrationJobDetailResponse.PageRecordCount"));
		describeMigrationJobDetailResponse.setSuccess(_ctx.stringValue("DescribeMigrationJobDetailResponse.Success"));
		describeMigrationJobDetailResponse.setTotalRecordCount(_ctx.longValue("DescribeMigrationJobDetailResponse.TotalRecordCount"));
		describeMigrationJobDetailResponse.setErrMessage(_ctx.stringValue("DescribeMigrationJobDetailResponse.ErrMessage"));
		describeMigrationJobDetailResponse.setPageNumber(_ctx.integerValue("DescribeMigrationJobDetailResponse.PageNumber"));

		List<DataInitializationDetail> dataInitializationDetailList = new ArrayList<DataInitializationDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList.Length"); i++) {
			DataInitializationDetail dataInitializationDetail = new DataInitializationDetail();
			dataInitializationDetail.setSourceOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].SourceOwnerDBName"));
			dataInitializationDetail.setStatus(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].Status"));
			dataInitializationDetail.setTableName(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].TableName"));
			dataInitializationDetail.setErrorMessage(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].ErrorMessage"));
			dataInitializationDetail.setFinishRowNum(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].FinishRowNum"));
			dataInitializationDetail.setMigrationTime(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].MigrationTime"));
			dataInitializationDetail.setDestinationOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].DestinationOwnerDBName"));
			dataInitializationDetail.setTotalRowNum(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].TotalRowNum"));

			dataInitializationDetailList.add(dataInitializationDetail);
		}
		describeMigrationJobDetailResponse.setDataInitializationDetailList(dataInitializationDetailList);

		List<DataSynchronizationDetail> dataSynchronizationDetailList = new ArrayList<DataSynchronizationDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList.Length"); i++) {
			DataSynchronizationDetail dataSynchronizationDetail = new DataSynchronizationDetail();
			dataSynchronizationDetail.setStatus(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].Status"));
			dataSynchronizationDetail.setSourceOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].SourceOwnerDBName"));
			dataSynchronizationDetail.setTableName(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].TableName"));
			dataSynchronizationDetail.setErrorMessage(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].ErrorMessage"));
			dataSynchronizationDetail.setDestinationOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].DestinationOwnerDBName"));

			dataSynchronizationDetailList.add(dataSynchronizationDetail);
		}
		describeMigrationJobDetailResponse.setDataSynchronizationDetailList(dataSynchronizationDetailList);

		List<StructureInitializationDetail> structureInitializationDetailList = new ArrayList<StructureInitializationDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList.Length"); i++) {
			StructureInitializationDetail structureInitializationDetail = new StructureInitializationDetail();
			structureInitializationDetail.setStatus(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].Status"));
			structureInitializationDetail.setSourceOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].SourceOwnerDBName"));
			structureInitializationDetail.setObjectDefinition(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ObjectDefinition"));
			structureInitializationDetail.setObjectType(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ObjectType"));
			structureInitializationDetail.setErrorMessage(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ErrorMessage"));
			structureInitializationDetail.setDestinationOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].DestinationOwnerDBName"));
			structureInitializationDetail.setObjectName(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ObjectName"));

			List<StructureInitializationDetail1> constraintList = new ArrayList<StructureInitializationDetail1>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList.Length"); j++) {
				StructureInitializationDetail1 structureInitializationDetail1 = new StructureInitializationDetail1();
				structureInitializationDetail1.setStatus(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].Status"));
				structureInitializationDetail1.setSourceOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].SourceOwnerDBName"));
				structureInitializationDetail1.setObjectDefinition(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].ObjectDefinition"));
				structureInitializationDetail1.setObjectType(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].ObjectType"));
				structureInitializationDetail1.setErrorMessage(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].ErrorMessage"));
				structureInitializationDetail1.setDestinationOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].DestinationOwnerDBName"));
				structureInitializationDetail1.setObjectName(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].ObjectName"));

				constraintList.add(structureInitializationDetail1);
			}
			structureInitializationDetail.setConstraintList(constraintList);

			structureInitializationDetailList.add(structureInitializationDetail);
		}
		describeMigrationJobDetailResponse.setStructureInitializationDetailList(structureInitializationDetailList);
	 
	 	return describeMigrationJobDetailResponse;
	}
}