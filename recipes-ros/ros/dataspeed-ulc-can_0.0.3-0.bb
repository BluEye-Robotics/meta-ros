DESCRIPTION = "Package to translate ROS messages to and from CAN messages to interact with the Universal Lat/Lon Controller (ULC) firmware"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp nodelet std-msgs geometry-msgs can-msgs dataspeed-ulc-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_ulc_ros-release/archive/release/melodic/dataspeed_ulc_can/0.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "37809ad3ca1e7dc2749fd0fe4cbf865d"
SRC_URI[sha256sum] = "85673897676564ab1aea0ffe505a10469008d058ca28ce81bce53b50b4641813"

ROS_SPN = "dataspeed_ulc_ros"
S = "${WORKDIR}/dataspeed_ulc_ros-release-release-melodic-dataspeed_ulc_can-0.0.3-0"

inherit catkin
