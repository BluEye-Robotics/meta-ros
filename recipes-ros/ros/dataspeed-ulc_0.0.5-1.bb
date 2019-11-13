DESCRIPTION = "CAN interface to the Universal Lat/Lon Controller (ULC) firmware"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "dataspeed-ulc-can dataspeed-ulc-msgs"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_ulc_ros-release/archive/release/melodic/dataspeed_ulc/0.0.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "afd755bf0bf65a4cfe193cb182d2a38c"
SRC_URI[sha256sum] = "c306396d1f0cfc3d287c5c1f468e43385b6c26eaedfcb34cead9022563b308fa"

ROS_SPN = "dataspeed_ulc_ros"
S = "${WORKDIR}/dataspeed_ulc_ros-release-release-melodic-dataspeed_ulc-0.0.5-1"

inherit catkin
