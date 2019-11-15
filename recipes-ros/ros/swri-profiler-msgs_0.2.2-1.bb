DESCRIPTION = "Messages for the swri_profiler tool."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/swri-robotics-gbp/swri_profiler-release/archive/release/melodic/swri_profiler_msgs/0.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c7b3acff1cea2552a5db5e79fb3e5e23"
SRC_URI[sha256sum] = "d1f7c0da94cd60aee2e36ea5967f09635e78fb931129a04b4bbbff7747df90d0"

ROS_SPN = "swri_profiler"
S = "${WORKDIR}/swri_profiler-release-release-melodic-swri_profiler_msgs-0.2.2-1"

inherit catkin
