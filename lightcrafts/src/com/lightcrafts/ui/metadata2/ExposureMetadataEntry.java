/* Copyright (C) 2005-2011 Fabio Riccardi */

package com.lightcrafts.ui.metadata2;

import static com.lightcrafts.ui.metadata2.Locale.LOCALE;
import com.lightcrafts.image.metadata.ImageMetadata;
import com.lightcrafts.image.metadata.CoreDirectory;
import com.lightcrafts.image.metadata.ImageMetadataDirectory;
import com.lightcrafts.image.metadata.CoreTags;
import com.lightcrafts.image.metadata.values.ImageMetaValue;
import com.lightcrafts.image.ImageInfo;

class ExposureMetadataEntry extends MetadataEntry {

    public String getLabel(ImageMetadata meta) {
        return LOCALE.get("ExposureLabel");
    }

    public String getValue(ImageMetadata meta) {
        ImageMetadataDirectory dir = meta.getDirectoryFor(CoreDirectory.class);
        ImageMetaValue apertureValue = dir.getValue(CoreTags.CORE_APERTURE);
        ImageMetaValue speedValue = dir.getValue(CoreTags.CORE_SHUTTER_SPEED);
        if ((apertureValue != null) && (speedValue != null)) {
            String value = LOCALE.get(
                "ExposureValue", speedValue.toString(), apertureValue.toString()
            );
            return value;
        }
        return "";
    }

    public boolean isEditable(ImageInfo info) {
        return false;
    }

    public boolean isValidValue(ImageMetadata meta, String value) {
        return true;
    }

    public void setValue(ImageMetadata meta, String value) {
        // readonly
    }
}
