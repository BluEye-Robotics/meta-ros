DESCRIPTION = "Interface to the Dataspeed Inc. Power Distribution System (PDS)"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "dataspeed-pds-can dataspeed-pds-msgs dataspeed-pds-scripts"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_pds-release/archive/release/melodic/dataspeed_pds/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d59c4c90ca1e108bb24a54eb2af33460"
SRC_URI[sha256sum] = "d69d2b28ac8d0d207b3873acf559044a47c3b99d20fd20f01de6aa51cfe4feed"

S = "${WORKDIR}/dataspeed_pds-release-release-melodic-dataspeed_pds-1.0.2-0"

inherit catkin
