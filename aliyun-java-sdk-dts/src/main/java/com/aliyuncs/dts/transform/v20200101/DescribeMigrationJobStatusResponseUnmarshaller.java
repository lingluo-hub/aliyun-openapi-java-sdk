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

import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobStatusResponse;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobStatusResponse.DataInitializationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobStatusResponse.DataSynchronizationStatus;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobStatusResponse.DestinationEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobStatusResponse.MigrationMode;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobStatusResponse.PrecheckStatus;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobStatusResponse.PrecheckStatus.CheckItem;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobStatusResponse.SourceEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeMigrationJobStatusResponse.StructureInitializationStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrationJobStatusResponseUnmarshaller {

	public static DescribeMigrationJobStatusResponse unmarshall(DescribeMigrationJobStatusResponse describeMigrationJobStatusResponse, UnmarshallerContext _ctx) {
		
		describeMigrationJobStatusResponse.setRequestId(_ctx.stringValue("DescribeMigrationJobStatusResponse.RequestId"));
		describeMigrationJobStatusResponse.setMigrationJobName(_ctx.stringValue("DescribeMigrationJobStatusResponse.MigrationJobName"));
		describeMigrationJobStatusResponse.setMigrationJobStatus(_ctx.stringValue("DescribeMigrationJobStatusResponse.MigrationJobStatus"));
		describeMigrationJobStatusResponse.setErrCode(_ctx.stringValue("DescribeMigrationJobStatusResponse.ErrCode"));
		describeMigrationJobStatusResponse.setSuccess(_ctx.stringValue("DescribeMigrationJobStatusResponse.Success"));
		describeMigrationJobStatusResponse.setPayType(_ctx.stringValue("DescribeMigrationJobStatusResponse.PayType"));
		describeMigrationJobStatusResponse.setErrMessage(_ctx.stringValue("DescribeMigrationJobStatusResponse.ErrMessage"));
		describeMigrationJobStatusResponse.setMigrationObject(_ctx.stringValue("DescribeMigrationJobStatusResponse.MigrationObject"));
		describeMigrationJobStatusResponse.setMigrationJobId(_ctx.stringValue("DescribeMigrationJobStatusResponse.MigrationJobId"));
		describeMigrationJobStatusResponse.setTaskId(_ctx.stringValue("DescribeMigrationJobStatusResponse.TaskId"));
		describeMigrationJobStatusResponse.setMigrationJobClass(_ctx.stringValue("DescribeMigrationJobStatusResponse.MigrationJobClass"));

		DataInitializationStatus dataInitializationStatus = new DataInitializationStatus();
		dataInitializationStatus.setStatus(_ctx.stringValue("DescribeMigrationJobStatusResponse.DataInitializationStatus.Status"));
		dataInitializationStatus.setPercent(_ctx.stringValue("DescribeMigrationJobStatusResponse.DataInitializationStatus.Percent"));
		dataInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeMigrationJobStatusResponse.DataInitializationStatus.ErrorMessage"));
		dataInitializationStatus.setProgress(_ctx.stringValue("DescribeMigrationJobStatusResponse.DataInitializationStatus.Progress"));
		describeMigrationJobStatusResponse.setDataInitializationStatus(dataInitializationStatus);

		DataSynchronizationStatus dataSynchronizationStatus = new DataSynchronizationStatus();
		dataSynchronizationStatus.setStatus(_ctx.stringValue("DescribeMigrationJobStatusResponse.DataSynchronizationStatus.Status"));
		dataSynchronizationStatus.setPercent(_ctx.stringValue("DescribeMigrationJobStatusResponse.DataSynchronizationStatus.Percent"));
		dataSynchronizationStatus.setDelay(_ctx.stringValue("DescribeMigrationJobStatusResponse.DataSynchronizationStatus.Delay"));
		dataSynchronizationStatus.setErrorMessage(_ctx.stringValue("DescribeMigrationJobStatusResponse.DataSynchronizationStatus.ErrorMessage"));
		dataSynchronizationStatus.setCheckpoint(_ctx.stringValue("DescribeMigrationJobStatusResponse.DataSynchronizationStatus.Checkpoint"));
		describeMigrationJobStatusResponse.setDataSynchronizationStatus(dataSynchronizationStatus);

		DestinationEndpoint destinationEndpoint = new DestinationEndpoint();
		destinationEndpoint.setDatabaseName(_ctx.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.DatabaseName"));
		destinationEndpoint.setInstanceId(_ctx.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.InstanceId"));
		destinationEndpoint.setIP(_ctx.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.IP"));
		destinationEndpoint.setInstanceType(_ctx.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.InstanceType"));
		destinationEndpoint.setPort(_ctx.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.Port"));
		destinationEndpoint.setUserName(_ctx.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.UserName"));
		destinationEndpoint.setOracleSID(_ctx.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.oracleSID"));
		destinationEndpoint.setEngineName(_ctx.stringValue("DescribeMigrationJobStatusResponse.DestinationEndpoint.EngineName"));
		describeMigrationJobStatusResponse.setDestinationEndpoint(destinationEndpoint);

		MigrationMode migrationMode = new MigrationMode();
		migrationMode.setDataInitialization(_ctx.booleanValue("DescribeMigrationJobStatusResponse.MigrationMode.dataInitialization"));
		migrationMode.setDataSynchronization(_ctx.booleanValue("DescribeMigrationJobStatusResponse.MigrationMode.dataSynchronization"));
		migrationMode.setStructureInitialization(_ctx.booleanValue("DescribeMigrationJobStatusResponse.MigrationMode.structureInitialization"));
		describeMigrationJobStatusResponse.setMigrationMode(migrationMode);

		PrecheckStatus precheckStatus = new PrecheckStatus();
		precheckStatus.setStatus(_ctx.stringValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Status"));
		precheckStatus.setPercent(_ctx.stringValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Percent"));

		List<CheckItem> detail = new ArrayList<CheckItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Detail.Length"); i++) {
			CheckItem checkItem = new CheckItem();
			checkItem.setCheckStatus(_ctx.stringValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Detail["+ i +"].CheckStatus"));
			checkItem.setErrorMessage(_ctx.stringValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Detail["+ i +"].ErrorMessage"));
			checkItem.setItemName(_ctx.stringValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Detail["+ i +"].ItemName"));
			checkItem.setRepairMethod(_ctx.stringValue("DescribeMigrationJobStatusResponse.PrecheckStatus.Detail["+ i +"].RepairMethod"));

			detail.add(checkItem);
		}
		precheckStatus.setDetail(detail);
		describeMigrationJobStatusResponse.setPrecheckStatus(precheckStatus);

		SourceEndpoint sourceEndpoint = new SourceEndpoint();
		sourceEndpoint.setDatabaseName(_ctx.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.DatabaseName"));
		sourceEndpoint.setInstanceId(_ctx.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.InstanceId"));
		sourceEndpoint.setIP(_ctx.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.IP"));
		sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.InstanceType"));
		sourceEndpoint.setPort(_ctx.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.Port"));
		sourceEndpoint.setUserName(_ctx.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.UserName"));
		sourceEndpoint.setOracleSID(_ctx.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.oracleSID"));
		sourceEndpoint.setEngineName(_ctx.stringValue("DescribeMigrationJobStatusResponse.SourceEndpoint.EngineName"));
		describeMigrationJobStatusResponse.setSourceEndpoint(sourceEndpoint);

		StructureInitializationStatus structureInitializationStatus = new StructureInitializationStatus();
		structureInitializationStatus.setStatus(_ctx.stringValue("DescribeMigrationJobStatusResponse.StructureInitializationStatus.Status"));
		structureInitializationStatus.setPercent(_ctx.stringValue("DescribeMigrationJobStatusResponse.StructureInitializationStatus.Percent"));
		structureInitializationStatus.setErrorMessage(_ctx.stringValue("DescribeMigrationJobStatusResponse.StructureInitializationStatus.ErrorMessage"));
		structureInitializationStatus.setProgress(_ctx.stringValue("DescribeMigrationJobStatusResponse.StructureInitializationStatus.Progress"));
		describeMigrationJobStatusResponse.setStructureInitializationStatus(structureInitializationStatus);
	 
	 	return describeMigrationJobStatusResponse;
	}
}