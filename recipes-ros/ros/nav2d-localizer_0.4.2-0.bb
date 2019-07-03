DESCRIPTION = "Wrapper around Particle Filter implementation. The SelfLocalizer can be used as library or as a ros-node."
AUTHOR = "Sebastian Kasperski"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "roscpp tf nav-msgs sensor-msgs geometry-msgs roscpp tf nav-msgs sensor-msgs geometry-msgs"

RDEPENDS_${PN} = "roscpp tf nav-msgs sensor-msgs geometry-msgs"

SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d_localizer/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "745e73b746ff2d16c926aa17a4f405fa"
SRC_URI[sha256sum] = "208e7b94f3e9a0f384f7de704056d90747e8df288e7dd48650fd1ec1b3125b98"

ROS_SPN = "navigation_2d"
S = "${WORKDIR}/navigation_2d-release-release-melodic-nav2d_localizer-0.4.2-0"

inherit catkin
