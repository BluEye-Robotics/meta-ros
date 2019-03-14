DESCRIPTION = "Package which implements capabilities, including code to parse capability interface specs, to parse capability provider specs, and implement the capability server."
AUTHOR = "William Woodall"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation roslaunch rospy rostest std-msgs std-srvs bondpy message-runtime nodelet python-pyyaml roslaunch rospy std-msgs std-srvs"

RDEPENDS_${PN} = "bondpy message-runtime nodelet python-pyyaml roslaunch rospy std-msgs std-srvs"

SRC_URI = "https://github.com/ros-gbp/capabilities-release/archive/release/melodic/capabilities/0.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d9dc76bfdb7994d8aa2351f3edb8f6d3"
SRC_URI[sha256sum] = "adfb1e8a3002fcfc90f654c8def944f6cd7a8753b3e908b5760eca786b1546ef"

S = "${WORKDIR}/capabilities-release-release-melodic-capabilities-0.2.0-0"

inherit catkin
