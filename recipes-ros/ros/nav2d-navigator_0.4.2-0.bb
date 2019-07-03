DESCRIPTION = "This package provides a node for higher level navigation of a mobile robot in a planar environment. It needs a map and the robot's position within this map to create a plan for navigation. When used together with a SLAM module it can also be used to perform autonomous exploration of the robot's workspace."
AUTHOR = "Sebastian Kasperski"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "roscpp message-generation tf pluginlib actionlib actionlib-msgs geometry-msgs std-srvs nav2d-msgs nav2d-operator roscpp message-runtime tf pluginlib actionlib actionlib-msgs geometry-msgs std-srvs nav2d-msgs nav2d-operator"

RDEPENDS_${PN} = "roscpp message-runtime tf pluginlib actionlib actionlib-msgs geometry-msgs std-srvs nav2d-msgs nav2d-operator"

SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d_navigator/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eb3d66029cedf33110771bdc4630a499"
SRC_URI[sha256sum] = "d2f314f6da94486aaa5a19d27aa7c1a598950b95287b37a494359ba2911881aa"

ROS_SPN = "navigation_2d"
S = "${WORKDIR}/navigation_2d-release-release-melodic-nav2d_navigator-0.4.2-0"

inherit catkin
