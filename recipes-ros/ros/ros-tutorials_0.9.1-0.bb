DESCRIPTION = "ros_tutorials contains packages that demonstrate various features of ROS, as well as support packages which help demonstrate those features."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp-tutorials rospy-tutorials turtlesim"

RDEPENDS_${PN} = "roscpp-tutorials rospy-tutorials turtlesim"

SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/melodic/ros_tutorials/0.9.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9569069b61bcf0fdce8b17d1707f7dad"
SRC_URI[sha256sum] = "566f9e87ffd41023bf48a504e928de4e837676cfade117ef7c208c89e352fa4a"

S = "${WORKDIR}/ros_tutorials-release-release-melodic-ros_tutorials-0.9.1-0"

inherit catkin
