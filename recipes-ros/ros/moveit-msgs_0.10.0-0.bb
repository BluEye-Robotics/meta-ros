DESCRIPTION = "Messages, services and actions used by MoveIt"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation octomap-msgs actionlib-msgs sensor-msgs geometry-msgs trajectory-msgs shape-msgs object-recognition-msgs std-msgs message-runtime octomap-msgs actionlib-msgs sensor-msgs geometry-msgs trajectory-msgs shape-msgs object-recognition-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime octomap-msgs actionlib-msgs sensor-msgs geometry-msgs trajectory-msgs shape-msgs object-recognition-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/moveit_msgs-release/archive/release/melodic/moveit_msgs/0.10.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e697439c980ff9bb08711db60ca8fd2a"
SRC_URI[sha256sum] = "d1053ffe57d739fff282835af4753e39f484acad8a596049f8dc97825abeb881"

S = "${WORKDIR}/moveit_msgs-release-release-melodic-moveit_msgs-0.10.0-0"

inherit catkin
