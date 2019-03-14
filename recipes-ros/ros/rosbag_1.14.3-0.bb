DESCRIPTION = "This is a set of tools for recording from and playing back to ROS topics. It is intended to be high performance and avoids deserialization and reserialization of the messages."
AUTHOR = "Tim Field"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cpp-common python-imaging rosbag-storage rosconsole roscpp roscpp-serialization std-srvs topic-tools xmlrpcpp boost genmsg genpy python-pycrypto python-gnupg python-rospkg rosbag-storage rosconsole roscpp roslib rospy std-srvs topic-tools xmlrpcpp"

RDEPENDS_${PN} = "boost genmsg genpy python-pycrypto python-gnupg python-rospkg rosbag-storage rosconsole roscpp roslib rospy std-srvs topic-tools xmlrpcpp"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rosbag/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b5ff01cfa877cbfc49a8c079861b12fb"
SRC_URI[sha256sum] = "37736a1ad7ddeaddb4f651b8a4d10da75654bdf3ff6a4623f85f467c9125405d"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rosbag-1.14.3-0"

inherit catkin
