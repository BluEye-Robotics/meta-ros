DESCRIPTION = "Meta-Package containing modules for 2D-Navigation"
AUTHOR = "Sebastian Kasperski"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "nav2d-msgs nav2d-tutorials nav2d-operator nav2d-navigator nav2d-localizer nav2d-remote nav2d-karto nav2d-exploration"

RDEPENDS_${PN} = "nav2d-msgs nav2d-tutorials nav2d-operator nav2d-navigator nav2d-localizer nav2d-remote nav2d-karto nav2d-exploration"

SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c1b8c19055c565a0e62ce7b497415a22"
SRC_URI[sha256sum] = "290981964bfb9d4a38651fa57f321fe5b777363ac3e0b6f8dc0fd69ba4ec0a6b"

ROS_SPN = "navigation_2d"
S = "${WORKDIR}/navigation_2d-release-release-melodic-nav2d-0.4.2-0"

inherit catkin
