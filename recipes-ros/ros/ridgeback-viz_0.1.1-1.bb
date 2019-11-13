DESCRIPTION = "Visualization launchers and helpers for Ridgeback."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch ridgeback-description joint-state-publisher"

RDEPENDS_${PN} = "ridgeback-description joint-state-publisher"

SRC_URI = "https://github.com/clearpath-gbp/ridgeback_desktop-release/archive/release/melodic/ridgeback_viz/0.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4bfe7eea73373af43ffb5e0934a21e09"
SRC_URI[sha256sum] = "14418566a065e1a70a90730c24796c9bc51d78f797302f8fecbafd525be7483f"

ROS_SPN = "ridgeback_desktop"
S = "${WORKDIR}/ridgeback_desktop-release-release-melodic-ridgeback_viz-0.1.1-1"

inherit catkin
