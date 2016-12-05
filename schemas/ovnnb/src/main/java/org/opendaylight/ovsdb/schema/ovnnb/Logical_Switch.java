/*
 * Copyright (c) 2016 DT-Dream, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.ovsdb.schema.ovnnb;
import java.util.Map;
import java.util.Set;

import org.opendaylight.ovsdb.lib.notation.Column;
import org.opendaylight.ovsdb.lib.notation.UUID;
import org.opendaylight.ovsdb.lib.schema.GenericTableSchema;
import org.opendaylight.ovsdb.lib.schema.typed.MethodType;
import org.opendaylight.ovsdb.lib.schema.typed.TypedBaseTable;
import org.opendaylight.ovsdb.lib.schema.typed.TypedColumn;
import org.opendaylight.ovsdb.lib.schema.typed.TypedTable;

/**
 * This class is a typed interface to the Logical_Switch Table
 */
@TypedTable(name="Logical_Switch", database="OVN_Northbound", fromVersion="1.0.0")
public interface Logical_Switch extends TypedBaseTable<GenericTableSchema> {

    @TypedColumn(name="name", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getNameColumn();
    @TypedColumn(name="name", method=MethodType.GETDATA, fromVersion="1.0.0")
    String getName();
    @TypedColumn(name="name", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setName(String name);

    @TypedColumn(name="ports", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Set<UUID>> getPortsColumn();
    @TypedColumn(name="ports", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setPorts(Set<UUID> ports);

    @TypedColumn(name="load_balancer", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Set<UUID>> getLoad_balancerColumn();
    @TypedColumn(name="load_balancer", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setLoad_balancer(Set<UUID> load_balancer);

    @TypedColumn(name="acls", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Set<UUID>> getAclsColumn();
    @TypedColumn(name="acls", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setAcls(Set<UUID> acls);

    @TypedColumn(name="other_config", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Map<String, String>> getOtherConfigColumn();
    @TypedColumn(name="other_config", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setOtherConfig(Map<String, String> otherConfig);

    @TypedColumn(name="external_ids", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Map<String, String>> getExternalIdsColumn();
    @TypedColumn(name="external_ids", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setExternalIds(Map<String, String> externalIds);

}
