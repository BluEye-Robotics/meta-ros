DESCRIPTION = "This package defines services that are used to communicate with the realtime control loop. It also defines messages that represent the state of the realtime controllers, the joints and the actuators."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs message-generation std-msgs actionlib-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "actionlib-msgs message-runtime std-msgs"

SRC_URI = "https://github.com/ros-gbp/pr2_mechanism_msgs-release/archive/release/melodic/pr2_mechanism_msgs/1.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a9d3bf956b47f2cd0fbea7adacf4706d"
SRC_URI[sha256sum] = "ed530def634447f8d6970857f1f33b8ddfadefc07cffd6e4ce01e71e179df4cf"

S = "${WORKDIR}/pr2_mechanism_msgs-release-release-melodic-pr2_mechanism_msgs-1.8.2-0"

inherit catkin
