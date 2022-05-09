/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.iam.credentials.v1.samples;

// [START credentials_v1_generated_iamcredentialsclient_signblob_stringliststringbytestring_sync]
import com.google.cloud.iam.credentials.v1.IamCredentialsClient;
import com.google.cloud.iam.credentials.v1.ServiceAccountName;
import com.google.cloud.iam.credentials.v1.SignBlobResponse;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.List;

public class SyncSignBlobStringListstringBytestring {

  public static void main(String[] args) throws Exception {
    syncSignBlobStringListstringBytestring();
  }

  public static void syncSignBlobStringListstringBytestring() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (IamCredentialsClient iamCredentialsClient = IamCredentialsClient.create()) {
      String name = ServiceAccountName.of("[PROJECT]", "[SERVICE_ACCOUNT]").toString();
      List<String> delegates = new ArrayList<>();
      ByteString payload = ByteString.EMPTY;
      SignBlobResponse response = iamCredentialsClient.signBlob(name, delegates, payload);
    }
  }
}
// [END credentials_v1_generated_iamcredentialsclient_signblob_stringliststringbytestring_sync]