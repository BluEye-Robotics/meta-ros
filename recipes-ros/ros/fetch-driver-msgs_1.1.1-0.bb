DESCRIPTION = "Messages for the fetch_drivers package"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation actionlib actionlib-msgs geometry-msgs power-msgs std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_msgs-release/archive/release/melodic/fetch_driver_msgs/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "79e36184395dcc594274eaad45d4e365"
SRC_URI[sha256sum] = "aa88a178c8b721288077bbbb32c4bd4ca3b36e3b2cbda1535320326140d82ec5"

ROS_SPN = "fetch_msgs"
S = "${WORKDIR}/fetch_msgs-release-release-melodic-fetch_driver_msgs-1.1.1-0"

inherit catkin
