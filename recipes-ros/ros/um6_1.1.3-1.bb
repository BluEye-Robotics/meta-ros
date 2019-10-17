DESCRIPTION = "The um6 package provides a C++ implementation of the CH Robotics serial protocol, and a corresponding ROS node for publishing standard ROS orientation topics from a UM6."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "serial roscpp roslint sensor-msgs message-generation serial roscpp sensor-msgs message-runtime"

RDEPENDS_${PN} = "serial roscpp sensor-msgs message-runtime"

SRC_URI = "https://github.com/ros-drivers-gbp/um6-release/archive/release/melodic/um6/1.1.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7877efed0bb6343f1a53050171b2fec5"
SRC_URI[sha256sum] = "2dab6e1c445eb2ac9fb634a8df474aec4e9f269f5a19832109ba8ba324ffcadd"

S = "${WORKDIR}/um6-release-release-melodic-um6-1.1.3-1"

inherit catkin
