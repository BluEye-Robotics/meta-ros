DESCRIPTION = "Contains a set of tutorials that run 2D-Navigation within Stage-Simulator."
AUTHOR = "Sebastian Kasperski"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "nav2d-msgs nav2d-operator nav2d-navigator nav2d-localizer nav2d-remote nav2d-karto nav2d-exploration"

RDEPENDS_${PN} = "nav2d-msgs nav2d-operator nav2d-navigator nav2d-localizer nav2d-remote nav2d-karto nav2d-exploration"

SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d_tutorials/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "deed3f6110d1a62e7141222c2e62623e"
SRC_URI[sha256sum] = "ae60ec866cca40ba8cd6f96181b3dfed1bde5cac12dd9813260a77837e078b3b"

ROS_SPN = "navigation_2d"
S = "${WORKDIR}/navigation_2d-release-release-melodic-nav2d_tutorials-0.4.2-0"

inherit catkin
