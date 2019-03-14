DESCRIPTION = "diagnostic_updater contains tools for easily updating diagnostics. it is commonly used in device drivers to keep track of the status of output topics, device status, etc."
AUTHOR = "Kevin Watts"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs roscpp rostest std-msgs diagnostic-msgs roscpp std-msgs"

RDEPENDS_${PN} = "diagnostic-msgs roscpp std-msgs"

SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/melodic/diagnostic_updater/1.9.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a8b19f8a99f89c4800a66ce3101d612d"
SRC_URI[sha256sum] = "5ac66485bad485a41a0de8647ecde0dda778e54648f6bce43c3b5e53a7aef16e"

ROS_SPN = "diagnostics"
S = "${WORKDIR}/diagnostics-release-release-melodic-diagnostic_updater-1.9.3-0"

inherit catkin
