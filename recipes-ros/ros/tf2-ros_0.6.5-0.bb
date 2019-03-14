DESCRIPTION = "This package contains the ROS bindings for the tf2 library, for both Python and C++."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs geometry-msgs message-filters roscpp rosgraph rospy std-msgs tf2 tf2-msgs tf2-py xmlrpcpp actionlib actionlib-msgs geometry-msgs message-filters roscpp rosgraph rospy std-msgs tf2 tf2-msgs tf2-py xmlrpcpp"

RDEPENDS_${PN} = "actionlib actionlib-msgs geometry-msgs message-filters roscpp rosgraph rospy std-msgs tf2 tf2-msgs tf2-py xmlrpcpp"

SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/melodic/tf2_ros/0.6.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "954513035634c0a50839a51a30ea1c43"
SRC_URI[sha256sum] = "f5ea730b28e1668228c151fec493a768164843aa867770570c93ba3dcbda2d0f"

ROS_SPN = "geometry2"
S = "${WORKDIR}/geometry2-release-release-melodic-tf2_ros-0.6.5-0"

inherit catkin
