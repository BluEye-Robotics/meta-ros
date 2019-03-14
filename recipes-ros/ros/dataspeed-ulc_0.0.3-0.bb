DESCRIPTION = "CAN interface to the Universal Lat/Lon Controller (ULC) firmware"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "dataspeed-ulc-can dataspeed-ulc-msgs"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_ulc_ros-release/archive/release/melodic/dataspeed_ulc/0.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c725304eb77580b2df5dff65cb55cdde"
SRC_URI[sha256sum] = "471b98597bb7b5f02af67b0c268f2285f4defa360d371091972f5d826d2f25e4"

ROS_SPN = "dataspeed_ulc_ros"
S = "${WORKDIR}/dataspeed_ulc_ros-release-release-melodic-dataspeed_ulc-0.0.3-0"

inherit catkin
