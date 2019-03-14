DESCRIPTION = "marti_visualization_msgs"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs sensor-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/melodic/marti_visualization_msgs/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e1d0ee609c396cbe253aeda8af9ce2ce"
SRC_URI[sha256sum] = "09801787ccf1dbfc0dca3e719e3444552fb5d05834fa8036961ae603866e0cd2"

ROS_SPN = "marti_messages"
S = "${WORKDIR}/marti_messages-release-release-melodic-marti_visualization_msgs-0.8.0-0"

inherit catkin
