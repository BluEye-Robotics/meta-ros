DESCRIPTION = "This package is currently for internal use only. Its API may change without warning in the future. This package is deprecated."
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslib roscpp roslib roscpp"

RDEPENDS_${PN} = "roslib roscpp"

SRC_URI = "https://github.com/ros-gbp/driver_common-release/archive/release/melodic/timestamp_tools/1.6.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f8c4874d1e918fc14e3fc1d93eeed5d9"
SRC_URI[sha256sum] = "dabb75248bb8528c603d556f7533df6bf701870db84b5d5c5983e2d7f08464b0"

ROS_SPN = "driver_common"
S = "${WORKDIR}/driver_common-release-release-melodic-timestamp_tools-1.6.8-0"

inherit catkin
