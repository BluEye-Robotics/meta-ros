DESCRIPTION = "Extensions for slime to assist in working with ROS packages"
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=c60c465e235b13ecfc23607d3b1b9e2f"

DEPENDS = "rosemacs slime-wrapper sbcl"

RDEPENDS_${PN} = "rosemacs slime-wrapper sbcl"

SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/melodic/slime_ros/0.4.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "57d8964aec6bf45afe2292a019c26007"
SRC_URI[sha256sum] = "6bfbb259a012cdddcccf9a39af143ba7468decfddb79d77b76be096b31b7a358"

ROS_SPN = "ros_emacs_utils"
S = "${WORKDIR}/ros_emacs_utils-release-release-melodic-slime_ros-0.4.13-0"

inherit catkin
