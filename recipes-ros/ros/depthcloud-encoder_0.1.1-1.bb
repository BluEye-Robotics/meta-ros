DESCRIPTION = "Point Cloud Encoder for Web-Based Streaming"
AUTHOR = "Julius Kammer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge dynamic-reconfigure image-transport message-filters roscpp sensor-msgs pcl-ros pcl-conversions tf-conversions"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/RobotWebTools-release/depthcloud_encoder-release/archive/release/melodic/depthcloud_encoder/0.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d75910d075e355984b42cd493b53ca2a"
SRC_URI[sha256sum] = "cd0303245ac1fcc135761ad4d18dda3ed256e4165cf4fbbd6a4182037cecece6"

S = "${WORKDIR}/depthcloud_encoder-release-release-melodic-depthcloud_encoder-0.1.1-1"

inherit catkin
