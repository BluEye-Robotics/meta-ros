DESCRIPTION = "Messages used for 2D-Navigation."
AUTHOR = "Sebastian Kasperski"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "message-generation std-msgs sensor-msgs geometry-msgs message-runtime std-msgs sensor-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs sensor-msgs geometry-msgs"

SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d_msgs/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b51abc0b4b61068def4b5e3926bd540a"
SRC_URI[sha256sum] = "0905a0e0fde94cf6fc3876a5ff6f0f987b66dd9ffb756d578e45c71f22148b51"

ROS_SPN = "navigation_2d"
S = "${WORKDIR}/navigation_2d-release-release-melodic-nav2d_msgs-0.4.2-0"

inherit catkin
