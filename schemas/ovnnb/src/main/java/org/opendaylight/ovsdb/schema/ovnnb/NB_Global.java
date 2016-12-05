/*
 * Copyright (c) 2016 DT-Dream and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.ovsdb.schema.ovnnb;

import java.util.Map;

import org.opendaylight.ovsdb.lib.notation.Column;
import org.opendaylight.ovsdb.lib.schema.GenericTableSchema;
import org.opendaylight.ovsdb.lib.schema.typed.MethodType;
import org.opendaylight.ovsdb.lib.schema.typed.TypedBaseTable;
import org.opendaylight.ovsdb.lib.schema.typed.TypedColumn;
import org.opendaylight.ovsdb.lib.schema.typed.TypedTable;

/**
 * This class is a typed interface to the NB_Global Table
 */
@TypedTable(name="NB_Global", database="OVN_Northbound", fromVersion="1.0.0")
public interface NB_Global extends TypedBaseTable<GenericTableSchema> {

    @TypedColumn(name="nb_cfg", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Long> getNbCfgColumn();
    @TypedColumn(name="nb_cfg", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setNbCfgColumn(Long count);

    @TypedColumn(name="sb_cfg", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Long> getSbCfgColumn();
    @TypedColumn(name="sb_cfg", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setSbCfgColumn(Long count);

    @TypedColumn(name="hv_cfg", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Long> getHvCfgColumn();
    @TypedColumn(name="hv_cfg", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setHvCfgColumn(Long count);

    @TypedColumn(name="external_ids", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Map<String, String>> getExternalIdsColumn();
    @TypedColumn(name="external_ids", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setExternalIds(Map<String, String> externalIds);
}
