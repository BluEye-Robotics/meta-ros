DESCRIPTION = "This package holds the diagnostic messages which provide the standardized interface for the diagnostic and runtime monitoring systems in ROS. These messages are currently used by the"
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/melodic/diagnostic_msgs/1.12.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9d6db6ec920ef047134eaa6b008fef84"
SRC_URI[sha256sum] = "649136f24515903a713e856fe413d5692073ce77b2970afefbb510af76964e70"

ROS_SPN = "common_msgs"
S = "${WORKDIR}/common_msgs-release-release-melodic-diagnostic_msgs-1.12.7-0"

inherit catkin
