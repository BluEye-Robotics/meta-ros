DESCRIPTION = "ROS messages for interacting with the Universal Lat/Lon Controller (ULC)"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_ulc_ros-release/archive/release/melodic/dataspeed_ulc_msgs/0.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d20cadf96f26db39216f3e90268af7d3"
SRC_URI[sha256sum] = "4547e16e8182c95fab5e2b34575f8eccef5d687496e0d20f7b2dc937f8632411"

ROS_SPN = "dataspeed_ulc_ros"
S = "${WORKDIR}/dataspeed_ulc_ros-release-release-melodic-dataspeed_ulc_msgs-0.0.3-0"

inherit catkin
