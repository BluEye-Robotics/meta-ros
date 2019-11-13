DESCRIPTION = "ROS messages for interacting with the Universal Lat/Lon Controller (ULC)"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_ulc_ros-release/archive/release/melodic/dataspeed_ulc_msgs/0.0.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2044eb7a5c7878f942df8052690f470d"
SRC_URI[sha256sum] = "0e55bcdae84e02def23cae30229d709877cb4a1202a8bd133d2746a6b32d3cae"

ROS_SPN = "dataspeed_ulc_ros"
S = "${WORKDIR}/dataspeed_ulc_ros-release-release-melodic-dataspeed_ulc_msgs-0.0.5-1"

inherit catkin
