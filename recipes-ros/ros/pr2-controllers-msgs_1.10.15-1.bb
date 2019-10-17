DESCRIPTION = "Messages, services, and actions used in the pr2_controllers stack."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs trajectory-msgs geometry-msgs message-generation actionlib-msgs trajectory-msgs geometry-msgs message-runtime"

RDEPENDS_${PN} = "actionlib-msgs trajectory-msgs geometry-msgs message-runtime"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/pr2_controllers_msgs/1.10.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "73b7a7464597642ef01d322569dd3beb"
SRC_URI[sha256sum] = "12c67675691e346b4007f9e7f8fb69e83b4c65be62f955b2a9f71f95a6099211"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-pr2_controllers_msgs-1.10.15-1"

inherit catkin
