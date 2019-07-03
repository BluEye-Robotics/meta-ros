DESCRIPTION = "The operator is a lightweight, purely reactive obstacle-avoidance module for mobile robots moving in a planar environment. The operator node works by evaluating a set of predefined motion primitives based on a local costmap and a desired direction. The best evaluated motion command will be send to the mobile base."
AUTHOR = "Sebastian Kasperski"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "roscpp message-generation tf tf2-ros costmap-2d sensor-msgs roscpp message-runtime tf costmap-2d sensor-msgs"

RDEPENDS_${PN} = "roscpp message-runtime tf costmap-2d sensor-msgs"

SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d_operator/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7a7bf4d1d4ec75fa21692699dbbf5d8a"
SRC_URI[sha256sum] = "a8ba977c06ec3334210448ff31687a876686fe661f3b50f407471465c81faccd"

ROS_SPN = "navigation_2d"
S = "${WORKDIR}/navigation_2d-release-release-melodic-nav2d_operator-0.4.2-0"

inherit catkin
