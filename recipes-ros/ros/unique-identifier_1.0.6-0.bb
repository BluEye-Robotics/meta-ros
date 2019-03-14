DESCRIPTION = "ROS messages and interfaces for universally unique identifiers. Not needed for wet packages, use only to resolve dry stack dependencies."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "unique-id uuid-msgs"

RDEPENDS_${PN} = "unique-id uuid-msgs"

SRC_URI = "https://github.com/ros-geographic-info/unique_identifier-release/archive/release/melodic/unique_identifier/1.0.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "acbc6d10cfe1c18eedd8539ce13d4476"
SRC_URI[sha256sum] = "d1e54e7f1f8f2d9a6e7d481ee0c300dc7440f3033915afba621257aac6ff7d8b"

S = "${WORKDIR}/unique_identifier-release-release-melodic-unique_identifier-1.0.6-0"

inherit catkin
